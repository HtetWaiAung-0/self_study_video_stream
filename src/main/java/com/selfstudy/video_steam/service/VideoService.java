package com.selfstudy.video_steam.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.selfstudy.video_steam.model.Video;

public interface VideoService {
    Video getVideo(String name);

    void  saveVideo(MultipartFile file,String name) throws IOException;

    List<String> getAllVideoNames();
}
