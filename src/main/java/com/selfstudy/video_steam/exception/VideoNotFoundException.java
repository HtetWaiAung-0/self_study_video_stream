package com.selfstudy.video_steam.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "A video with this name already exists")
public class VideoNotFoundException extends RuntimeException {

}
