package com.timer.controller;

import com.timer.model.Competitor;
import com.timer.repository.CompetitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class CompetitorController {
    @Autowired
    private CompetitorRepository competitorRepository;

    @RequestMapping(value="competitors", method = RequestMethod.GET)
    public List<Competitor> list() {
        return competitorRepository.findAll();
    }

}
