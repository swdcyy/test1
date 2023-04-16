package com.kuaishou.webkit.adapter.QuotaUpdaterAdapter;
import com.kuaishou.webkit.WebStorage$QuotaUpdater;
import android.webkit.WebStorage$QuotaUpdater;
import java.lang.Object;

public class QuotaUpdaterAdapter implements WebStorage$QuotaUpdater	// class@0012aa
{
    public WebStorage$QuotaUpdater mStub;

    public void QuotaUpdaterAdapter(WebStorage$QuotaUpdater p0){
       super();
       this.mStub = p0;
    }
    public void updateQuota(long p0){
       this.mStub.updateQuota(p0);
    }
}
