package com.timer.controller;

import com.timer.model.Competitor;
import com.timer.model.DataRelay;
import com.timer.repository.CompetitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class DataRelayController {
    @Autowired
    private CompetitorRepository competitorRepository;

    @RequestMapping(value="time", method = RequestMethod.PUT)
    public Competitor update(@RequestBody DataRelay dataRelay) {
        Competitor targetCompetitor = competitorRepository.findOne(dataRelay.getAthleteId());
        if(dataRelay.getTimerId() == 0) targetCompetitor.setSplitTime(dataRelay.getTime());
        else targetCompetitor.setFinishTime(dataRelay.getTime());
        return competitorRepository.saveAndFlush(targetCompetitor);
    }
}
