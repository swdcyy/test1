package com.kwai.video.wayne.player.multisource.switcher.DataSourceFetchCallback;
import java.lang.Object;
import java.lang.String;
import com.kwai.video.wayne.player.datasource.IDatasource;

public abstract class DataSourceFetchCallback	// class@000dae
{

    public void DataSourceFetchCallback(){
       super();
    }
    public abstract void onFailed(String p0);
    public abstract void onSucceed(IDatasource p0);
}
