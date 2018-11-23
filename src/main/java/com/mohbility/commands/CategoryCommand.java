package com.mohbility.commands;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
@Data
@NoArgsConstructor
public class CategoryCommand {


    private Long id;
    private String description;
    private Set<RecipeCommand> recipes;

}
