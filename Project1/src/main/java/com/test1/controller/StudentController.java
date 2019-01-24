package com.test1.controller;

import com.test1.model.Student;
import com.test1.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ModelAndView getAllStudent() {
        ModelAndView modelAndView = new ModelAndView("home");
        List<Student> studentList = studentService.getAllStudent();
        modelAndView.addObject("studentlist", studentList);
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addStudent() {
        ModelAndView modelAndView = new ModelAndView("student_form");
        Student student = new Student();
        modelAndView.addObject("student", student);
        return modelAndView;
    }



    @RequestMapping(value = "/update/{roll}", method = RequestMethod.GET)
    public ModelAndView updateStudentInfo( @PathVariable("roll") Integer roll ) {
        ModelAndView modelAndView = new ModelAndView("student_form");
        Student student = studentService.getStudentByRoll(roll);
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @RequestMapping( value = "/save", method = RequestMethod.POST )
    public ModelAndView saveStudent( @ModelAttribute( "student" ) Student student ) {
        studentService.saveOrUpdate(student);
        return new ModelAndView( "redirect:/all" );
    }


    @RequestMapping( value = "/delete/{roll}", method = RequestMethod.GET )
    public ModelAndView deleteStudent( @PathVariable("roll") Integer roll ) {
        studentService.delete(roll);
        return new ModelAndView( "redirect:/all" );
    }

}
