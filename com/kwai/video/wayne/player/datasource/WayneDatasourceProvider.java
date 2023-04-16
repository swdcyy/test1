package com.kwai.video.wayne.player.datasource.WayneDatasourceProvider;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetcher;
import com.kwai.video.wayne.player.datasource.IDatasource;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.wayne.player.multisource.switcher.DataSourceFetchCallback;
import com.kwai.video.wayne.player.multisource.switcher.FetchReason;
import gw7.a;

public class WayneDatasourceProvider implements DataSourceFetcher	// class@000d20
{
    public DataSourceFetcher dataSourceFetcher;
    public boolean fetchBeforePlay;
    public IDatasource mDatasource;
    public static String logTag = "WayneDatasourceProvider";

    public void WayneDatasourceProvider(IDatasource p0){
       super();
       this.fetchBeforePlay = false;
       this.mDatasource = p0;
    }
    public void cancel(){
       if (PatchProxy.applyVoid(null, this, WayneDatasourceProvider.class, "2")) {
          return;
       }
       this.dataSourceFetcher.cancel();
       return;
    }
    public void fetch(DataSourceFetchCallback p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WayneDatasourceProvider.class, "1")) {
          return;
       }
       WayneDatasourceProvider tdataSourceF = this.dataSourceFetcher;
       if (tdataSourceF != null) {
          tdataSourceF.fetch(p0);
       }else {
          p0.onFailed("noFetcher");
       }
       return;
    }
    public void fetch(DataSourceFetchCallback p0,FetchReason p1){
       a.a(this, p0, p1);
    }
    public IDatasource getDatasource(){
       return this.mDatasource;
    }
    public DataSourceFetcher getFetcher(){
       return this.dataSourceFetcher;
    }
    public void setDatasource(IDatasource p0){
       this.mDatasource = p0;
    }
    public void setFetcher(DataSourceFetcher p0){
       this.dataSourceFetcher = p0;
    }
    public boolean shouldFetchBeforePlay(){
       boolean b = (this.mDatasource == null)? true: false;
       return b;
    }
}
