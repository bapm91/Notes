package com.example.user.notes;

public interface NotesRepository {

   int getCount();
   Note get(int position);
   boolean delete(int position);
   Note create();
   Note update(Note note, int position);
   Note read(int position);
}
