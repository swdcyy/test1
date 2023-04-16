package ced.c2;
import erd.g;
import com.yxcorp.plugin.search.result.hashtag.presenters.k0;
import java.lang.Object;
import um6.j;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import com.yxcorp.plugin.search.entity.SearchItem;
import gbd.s;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.plugin.search.result.hashtag.entity.TagInfo;
import com.kuaishou.android.model.music.Music;
import java.lang.String;
import com.kuaishou.android.model.music.MusicType;

public final class c2 implements g	// class@000544
{
    public final k0 b;

    public void c2(k0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       c2 tb = this.b;
       k0 e = tb.E;
       if (e instanceof SearchResultFragment) {
          s.c(e, 1, false, tb.C);
       }
       TagInfo mMusic = tb.z.mMusic;
       p0.Oh(tb.getActivity(), mMusic.mId, mMusic.mType);
       return;
    }
}
