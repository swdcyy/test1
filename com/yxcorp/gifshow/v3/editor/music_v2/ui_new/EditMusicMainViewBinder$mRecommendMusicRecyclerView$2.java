package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.EditMusicMainViewBinder$mRecommendMusicRecyclerView$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;

public final class EditMusicMainViewBinder$mRecommendMusicRecyclerView$2 extends Lambda implements a	// class@0010fe
{
    public final View $rootView;

    public void EditMusicMainViewBinder$mRecommendMusicRecyclerView$2(View p0){
       this.$rootView = p0;
       super(0);
    }
    public final RecyclerView invoke(){
       View obj = PatchProxy.apply(null, this, EditMusicMainViewBinder$mRecommendMusicRecyclerView$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.$rootView.findViewById(R.id.edit_music_recommend_recycler_view);
       a.o(obj, "rootView.findViewById\(R.бн_recommend_recycler_view\)");
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
