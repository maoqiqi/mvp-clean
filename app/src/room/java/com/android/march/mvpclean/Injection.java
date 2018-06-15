package com.android.march.mvpclean;

import android.content.Context;

import com.android.march.mvpclean.data.source.TasksRepository;
import com.android.march.mvpclean.data.source.remote.TasksRemoteDataSource;
import com.android.march.mvpclean.data.source.room.TasksRoomDataSource;
import com.android.march.mvpclean.utils.AppExecutors;

public class Injection {

    public static TasksRepository provideTasksRepository(Context context) {
        return TasksRepository.getInstance(TasksRemoteDataSource.getInstance(),
                TasksRoomDataSource.getInstance(context, new AppExecutors()));
    }
}