package com.kwai.library.widget.refresh.config.KwaiRefreshManager$a;
import java.lang.Runnable;
import p17.a;
import java.lang.Object;
import com.kwai.library.widget.refresh.config.KwaiRefreshManager;
import androidx.collection.ArrayMap;
import java.lang.Integer;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class KwaiRefreshManager$a implements Runnable	// class@0009d4
{
    public final a b;

    public void KwaiRefreshManager$a(a p0){
       this.b = p0;
       super();
    }
    public final void run(){
       KwaiRefreshManager.e.b().put(Integer.valueOf(this.b.hashCode()), new WeakReference(this.b));
    }
}
