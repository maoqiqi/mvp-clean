package com.android.march.mvpclean;

import android.content.Context;

import com.android.march.mvpclean.data.source.TasksRepository;
import com.android.march.mvpclean.data.source.local.TasksLocalDataSource;
import com.android.march.mvpclean.data.source.remote.TasksRemoteDataSource;

public class Injection {

    public static TasksRepository provideTasksRepository(Context context) {
        return TasksRepository.getInstance(TasksRemoteDataSource.getInstance(),
                TasksLocalDataSource.getInstance(context));
    }
}