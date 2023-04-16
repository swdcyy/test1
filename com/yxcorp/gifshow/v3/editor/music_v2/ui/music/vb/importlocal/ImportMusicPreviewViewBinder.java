package com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicPreviewViewBinder;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewFragmentViewBinder;
import androidx.fragment.app.Fragment;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.utility.Log;
import j79.l0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.importlocal.ImportMusicPreviewViewBinder$a;
import android.view.View$OnClickListener;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.widget.TextView;
import com.yxcorp.gifshow.album.preview.PreviewViewPager;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import android.graphics.drawable.Drawable;
import o79.i;
import android.view.ViewGroup;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import com.yxcorp.gifshow.v3.editor.music_v2.utils.e;
import android.view.LayoutInflater;
import android.os.Bundle;
import ag6.a;

public class ImportMusicPreviewViewBinder extends AbsPreviewFragmentViewBinder	// class@0010ed
{
    public View j;

    public void ImportMusicPreviewViewBinder(Fragment p0,int p1){
       super(p0, p1);
       Log.g("ImportMusicPreviewVB", "ImportMusicPreviewViewBinder fragment:"+p0+" tabType:"+p1);
    }
    public boolean b(l0 p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ImportMusicPreviewViewBinder.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Log.g("ImportMusicPreviewVB", "onInterceptUserEventAlbum viewModel:"+p0);
       this.j.setOnClickListener(new ImportMusicPreviewViewBinder$a(this, p0));
       return false;
    }
    public void d(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImportMusicPreviewViewBinder.class, "1")) {
          return;
       }
       Log.g("ImportMusicPreviewVB", "setViewHolder viewHolder:"+p0);
       return;
    }
    public void e(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ImportMusicPreviewViewBinder.class, "3")) {
          return;
       }
       String str = "ImportMusicPreviewVB";
       Log.g(str, "bindView rootView:"+p0);
       super.e(p0);
       this.q(p0.findViewById(R.id.choice_circle));
       this.r(p0.findViewById(R.id.choice_circle_layout));
       this.s(p0.findViewById(R.id.choice_text));
       this.t(p0.findViewById(R.id.close_back));
       this.v(p0.findViewById(R.id.view_pager));
       this.u(p0.findViewById(R.id.title_bar));
       int i = 8;
       if (this.l() != null) {
          this.l().setVisibility(i);
       }else {
          i1.b(str, new RuntimeException("bindView error getChoiceText null"));
       }
       if (this.k() != null) {
          this.k().setVisibility(i);
       }else {
          i1.b(str, new RuntimeException("bindView error getChoiceCircleLayout null"));
       }
       if (this.o() != null) {
          this.o().setBackground(i.e(R.drawable.arg_RES_7f0802c9));
          this.o().setBackgroundColor(i.a(R.color.arg_RES_7f060b86));
       }else {
          i1.b(str, new RuntimeException("bindView error getTitleBar null"));
       }
       if (p0 instanceof ViewGroup) {
          View view = View.inflate(p0.getContext(), R.layout.arg_RES_7f0d1665, null);
          this.j = view;
          p0.addView(view);
          RelativeLayout$LayoutParams layoutParams = this.j.getLayoutParams();
          layoutParams.width = e.a(this.n().getActivity());
          layoutParams.addRule(12);
          layoutParams.addRule(14);
          this.j.setLayoutParams(layoutParams);
       }else {
          i1.b(str, new RuntimeException("bindView error rootView is not ViewGroup"));
       }
       return;
    }
    public View f(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, ImportMusicPreviewViewBinder.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Log.g("ImportMusicPreviewVB", "getBindView inflater:"+p0+" container:"+p1+" savedInstanceState:"+p2);
       return a.c(p0, 0x7f0d06fa, p1, false);
    }
}
