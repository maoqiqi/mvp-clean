package com.android.march.mvpclean.data.source;

import com.android.march.mvpclean.data.TaskBean;

import java.util.List;

public interface TasksDataSource {

    interface LoadTasksCallBack {

        void onTasksLoaded(List<TaskBean> taskBeanList);

        void onDataNotAvailable();
    }

    interface GetTaskCallBack {

        void onTaskLoaded(TaskBean taskBean);

        void onDataNotAvailable();
    }

    // 加载任务
    void loadTasks(LoadTasksCallBack callBack);

    // 得到某个任务
    void getTask(String taskId, GetTaskCallBack callBack);

    // 清除已完成任务
    void clearCompletedTasks();

    // 刷新
    void refreshTasks();

    // 添加任务
    void addTask(TaskBean taskBean);

    // 修改任务
    void updateTask(TaskBean taskBean);

    // 完成该任务
    void completeTask(TaskBean completedTaskBean);

    void completeTask(String taskId);

    // 未完成该任务
    void activateTask(TaskBean activeTaskBean);

    void activateTask(String taskId);

    // 删除所有任务
    void deleteAllTasks();

    // 删除任务
    void deleteTask(String taskId);
}