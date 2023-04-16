package com.kwai.nearby.local.delegate.HomeLocalDelegateInterface;
import java.io.Serializable;
import id7.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.social.nearby.LocalDelegateType;
import sc7.b0;
import android.view.View;
import com.kwai.nearby.local.HomeLocalFragment;

public interface abstract HomeLocalDelegateInterface implements Serializable	// class@000f87
{

    e buildTabCallerContext();
    void createItemPresenterExtra(PresenterV2 p0);
    void createLazyPresenterExtra(PresenterV2 p0);
    void createPreLoadPresenter(PresenterV2 p0);
    LocalDelegateType getType();
    void handlePageListExtra(b0 p0);
    void initHeaderView(View p0);
    void setOwner(HomeLocalFragment p0);
}
