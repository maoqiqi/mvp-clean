package com.android.march.mvpclean.taskdetail;

import com.android.march.mvpclean.base.BasePresenter;
import com.android.march.mvpclean.base.BaseView;
import com.android.march.mvpclean.data.TaskBean;

public interface TaskDetailContract {

    interface Presenter extends BasePresenter {

        void getTask();

        // 编辑任务
        void editTask();

        // 完成该任务
        void completeTask();

        // 未完成该任务
        void activateTask();

        // 删除任务
        void deleteTask();
    }

    interface View extends BaseView<Presenter> {

        boolean isActive();

        // 显示LOADING
        void setLoadingIndicator(boolean showLoading);

        void showTask(TaskBean taskBean);

        void showNoTask();

        void editTask(String taskId);

        void deleteTask();

        void showMessage(String message);
    }
}