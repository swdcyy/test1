package com.yxcorp.gifshow.v3.editor.sticker.e$a;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$g;
import com.yxcorp.gifshow.v3.editor.sticker.e;
import java.lang.Object;
import brd.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import uld.g;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import faa.a;
import q87.c;
import itc.k;
import erd.a;
import axc.i;

public class e$a implements ExpandFoldHelperView$g	// class@00122c
{
    public final e a;

    public void e$a(e p0){
       this.a = p0;
       super();
    }
    public a0 a(){
       Object[] objArray;
       AttrAnimProgressFragment obj = PatchProxy.apply(null, this, e$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.G.R();
       boolean b = false;
       String str = "StickerEditorPresenter";
       if (this.a.y.c()) {
          obj = new AttrAnimProgressFragment();
          obj.setCancelable(b);
          obj.show(this.a.getActivity().getSupportFragmentManager(), str);
          objArray = new Object[b];
          a.D().w(str, "onPreRightBtnClicked has task processing show progress", objArray);
          return this.a.y.h().m(new k(this, obj));
       }else {
          this.a.S8();
          objArray = new Object[b];
          a.D().w(str, "onPreRightBtnClicked show all AnimatedSubAsset in player", objArray);
          return a0.B(new Object());
       }
    }
    public a0 b(){
       return i.a(this);
    }
}
