package com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder$k;
import android.view.View$OnClickListener;
import com.kuaishou.post.story.entrance.vb.MoodTemplateViewBinder;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rp4.a;
import q87.c;
import com.kuaishou.post.story.entrance.vm.MoodTemplateViewModel;
import rp4.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;
import com.yxcorp.gifshow.activity.GifshowActivity;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.entrance.e;
import rp4.n;
import java.lang.Integer;
import java.lang.StringBuilder;
import android.content.Intent;
import com.kuaishou.post.story.activity.StoryAlbumActivity;
import android.content.Context;
import o79.a;

public final class MoodTemplateViewBinder$k implements View$OnClickListener	// class@000b63
{
    public final MoodTemplateViewBinder b;

    public void MoodTemplateViewBinder$k(MoodTemplateViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MoodTemplateViewBinder$k.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("MoodTemplateViewBinder", "mImportLocalTemplateContainer", objArray);
       String str = (this.b.S.z0())? "EDIT_MOOD_PHOTO": "PRODUCE_MOOD_PHOTO";
       b.g("MOOD_OPEN_ALBUM", str, "");
       MoodTemplateViewBinder$k tb = this.b;
       MoodTemplateViewBinder s = tb.S;
       FragmentActivity activity = tb.E().getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.activity.GifshowActivity");
       Objects.requireNonNull(s);
       if (!PatchProxy.applyVoidOneRefs(activity, s, MoodTemplateViewModel.class, "11")) {
          a.p(activity, "gifshowActivity");
          Object[] objArray1 = new Object[i];
          a.D().w("MoodTemplateViewModel", "openAlbum", objArray1);
          e i1 = s.n.i;
          if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidFourRefs(activity, Integer.valueOf(1), Integer.valueOf(1), i1, null, n.class, "11")) {
             Object[] objArray2 = new Object[i];
             a.D().s("StoryUtil", "startAlbum: taskId="+i1, objArray2);
             Intent intent = new Intent(activity, StoryAlbumActivity.class);
             intent.putExtra("default_select_tab", 1);
             intent.putExtra("start_enter_page_animation", R.anim.arg_RES_7f01011f);
             intent.putExtra("start_exit_page_animation", R.anim.arg_RES_7f01011d);
             intent.putExtra("activityOpenExitAnimation", R.anim.arg_RES_7f01011e);
             intent.putExtra("activityCloseEnterAnimation", R.anim.arg_RES_7f010123);
             intent.putExtra("STORY_ALBUM_CALL_SOURCE", 1);
             intent.putExtra("photo_task_id", i1);
             intent.putExtra("album_tab_list", a.c);
             activity.startActivityForResult(intent, 290);
          }
       }
       return;
    }
}
