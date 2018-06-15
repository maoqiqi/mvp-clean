package com.android.march.mvpclean.statistics;

import com.android.march.mvpclean.base.BasePresenter;
import com.android.march.mvpclean.base.BaseView;

public interface StatisticsContract {

    interface Presenter extends BasePresenter {

        void loadStatistics();
    }

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void setLoadingIndicator(boolean showLoading);

        void showStatistics(int numberOfActiveTasks, int numberOfCompletedTasks);

        void showMessage(String message);
    }
}