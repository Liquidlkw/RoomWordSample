package com.example.roomwordsample.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.roomwordsample.model.Repository;
import com.example.roomwordsample.model.Word;

import java.util.List;


public class WordViewModel extends AndroidViewModel {
    private Repository mRepository;
    private  LiveData<List<Word>> mAllWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mRepository = new Repository(application);
    }


     public LiveData<List<Word>> getAllWords() {
        mAllWords = mRepository.getAllWords();
        return mAllWords;
    }

    public void insert(Word word) {
        mRepository.insert(word);
    }

}
