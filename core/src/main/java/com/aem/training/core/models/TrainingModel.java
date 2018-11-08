package com.aem.training.core.models;

import java.util.*;
import java.util.Iterator;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageFilter;

import com.adobe.cq.sightly.WCMUsePojo;


public class TrainingModel extends WCMUsePojo {

    public String title;
    public String description;

    @Override
    public void activate() throws Exception {

        String t = getCurrentPage().getPageTitle();
        String d = getCurrentPage().getName();

        setTitle(t);
        setDescription(d);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
