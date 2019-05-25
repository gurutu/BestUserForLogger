package com.logger.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
 
    Logger logger = LoggerFactory.getLogger(LoggingController.class);
 
    @RequestMapping("/")
    public String index() {
        logger.trace("A TRACE Message bjfsdv jb fdns vbjsd fjvbusdf jvubsdfjg ufu busfdub hfds ub jsfd iujsfd jbsdfj bufsd");
        logger.debug("A DEBUG Message ufsjvbdfs vubfsds vj dfs v sdfj hv jd dfjhjsufd h vhj sdjf sn jfd  jh sdf h jhfd hd h bhfsd");
        logger.info("An INFO Message bjsffg");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");
 
        return "Howdy! Check out the Logs to see the output...";
    }
}