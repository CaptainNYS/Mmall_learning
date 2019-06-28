package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Admin on 2019/3/29.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
