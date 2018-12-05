package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: panmm
 * @date: 2018/12/4 11:35
 * @description:
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
