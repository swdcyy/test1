package com.iqiyi.android.qigsaw.core.splitload.SplitContentProvider;
import com.kwai.plugin.dva.feature.core.hook.component.ContentProviderProxy;
import java.lang.String;
import android.content.ContentProvider;

public abstract class SplitContentProvider extends ContentProviderProxy	// class@0006d2
{

    public void SplitContentProvider(){
       super();
    }
    public boolean checkRealContentProviderInstallStatus(String p0){
       boolean b = true;
       if (this.getRealContentProvider() != null) {
          return b;
       }
       if (this.getRealContentProvider() == null) {
          b = false;
       }
       return b;
    }
}
