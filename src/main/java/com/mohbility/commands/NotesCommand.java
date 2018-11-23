package com.mohbility.commands;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jt on 6/13/17.
 */
@Data
@NoArgsConstructor
public class NotesCommand {

    private Long id;
    private RecipeCommand recipe;
    private String recipeNotes;

}
