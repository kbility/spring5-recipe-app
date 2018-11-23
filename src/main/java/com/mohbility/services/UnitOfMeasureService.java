package com.mohbility.services;

import com.mohbility.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * @project spring5-recipe-app
 * @author: kbility
 * @Date: 11/22/2018
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();

}
