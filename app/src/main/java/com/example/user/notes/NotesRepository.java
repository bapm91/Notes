package com.example.user.notes;

public interface NotesRepository {

   int getCount();
   boolean get(int position);
   boolean delete(int position);
   boolean create(int position);
   boolean update(int position);
   boolean read(int position);

}
