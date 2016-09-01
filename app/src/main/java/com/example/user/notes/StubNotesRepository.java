package com.example.user.notes;

import java.util.ArrayList;
import java.util.List;

public class StubNotesRepository implements NotesRepository {

    private List<Note> mNoteList = new ArrayList<>();

    @Override
    public int getCount() {
        return mNoteList.size();
    }

    @Override
    public Note get(int position) {
        return mNoteList.get(position);
    }

    @Override
    public boolean delete(int position) {
        mNoteList.remove(position);
        return true;
    }

    @Override
    public Note create() {
        mNoteList.add(new Note());
        return mNoteList.get(mNoteList.size() - 1);
    }

    @Override
    public Note update(Note note, int position) {
        mNoteList.add(note);
        return mNoteList.get(position);
    }

    @Override
    public Note read(int position) {
        return mNoteList.get(position);
    }
}
