package com.sds.animalapp.domain;

import lombok.Data;

@Data
public class VolunteerApplication {
    private int id;
    private String title;
    private String vol_date;
    private int noticeId;
    private int memberIdx; 
}