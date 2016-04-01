package com.yeungeek.monkeyandroid.ui.repos;

import com.yeungeek.monkeyandroid.data.DataManager;
import com.yeungeek.monkeyandroid.data.model.Repo;
import com.yeungeek.monkeyandroid.ui.base.presenter.MvpLceRxPresenter;
import com.yeungeek.mvp.common.MvpPresenter;

import java.util.List;

import javax.inject.Inject;

import timber.log.Timber;

/**
 * Created by yeungeek on 2016/3/31.
 */
public class RepoPresenter extends MvpLceRxPresenter<RepoMvpView, List<Repo>> implements MvpPresenter<RepoMvpView> {
    private final DataManager dataManager;

    @Inject
    public RepoPresenter(final DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void listRepos(final String user, final boolean pullToRefresh) {
        Timber.d("get list %s repos", user);
        subscribe(dataManager.listRepos(user), pullToRefresh);
    }
}
