package com.yxcorp.gifshow.album.viewbinder.AbsAlbumFooterItemViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsAlbumItemViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.widget.TextView;

public abstract class AbsAlbumFooterItemViewBinder extends AbsAlbumItemViewBinder	// class@001acb
{
    public TextView e;

    public void AbsAlbumFooterItemViewBinder(Fragment p0,int p1){
       a.q(p0, "fragment");
       super(p0, p1);
    }
    public final void n(TextView p0){
       this.e = p0;
    }
}
