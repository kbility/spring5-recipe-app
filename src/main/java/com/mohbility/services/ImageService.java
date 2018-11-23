package com.mohbility.services;

import org.springframework.web.multipart.MultipartFile;

/**
 * @project spring5-recipe-app
 * @author: kbility
 * @Date: 11/23/2018
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);
}
