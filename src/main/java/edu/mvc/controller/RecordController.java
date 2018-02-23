package edu.mvc.controller;

import edu.mvc.dao.RecordDao;
import edu.mvc.model.Record;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/record")
public class RecordController {

    private RecordDao recordDao;

    public RecordController(RecordDao recordDao) {
        this.recordDao = recordDao;
    }

    @GetMapping("/list")
    public ModelAndView records() {
        ModelAndView view = new ModelAndView();
        view.setViewName("records");
        List<Record> records = recordDao.list();
        view.addObject("records", records);
        return view;
    }
}