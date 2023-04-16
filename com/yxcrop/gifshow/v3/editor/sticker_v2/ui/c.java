package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.Object;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.HashSet;
import io.reactivex.subjects.PublishSubject;
import mrd.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import qtc.b;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import qtc.a;
import androidx.lifecycle.ViewModel;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Workspace;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import androidx.lifecycle.MutableLiveData;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.a;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.Set;
import nmd.g;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.b;
import erd.o;
import t45.d;
import brd.z;
import nmd.k;
import nmd.j;
import erd.g;
import crd.b;

public class c	// class@000aa5
{
    public StickerLibraryFragment a;
    public final List b;
    public final Set c;
    public b d;
    public final c e;
    public boolean f;
    public a g;
    public PublishSubject h;
    public a i;
    public a j;
    public EditorDelegate k;

    public void c(EditorDelegate p0){
       super();
       this.b = Lists.b();
       this.c = new HashSet();
       this.d = null;
       this.e = PublishSubject.g();
       this.f = false;
       this.g = a.g();
       this.j = a.g();
       this.k = p0;
    }
    public void a(BaseFragment p0,PublishSubject p1,boolean p2,boolean p3){
       boolean b1;
       if (PatchProxy.isSupport(c.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, c.class, "1")) {
          return;
       }
       if (this.i == null) {
          this.i = ViewModelProviders.of(p0, new b(new EditStickerRepo())).get(a.class);
          boolean b = false;
          if (this.k.N() != null && this.k.N().v() != null) {
             b = h1.k(this.k.N().v());
             b1 = h1.j(this.k.N().v());
          }else {
             b1 = false;
          }
          this.i.s0().observe(p0, new a(this, b, b1));
       }
       this.b.clear();
       this.c.clear();
       this.i.p0(p3);
       this.c.add(new g(this));
       this.h = p1;
       this.f = p2;
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       this.d = this.e.debounce(50, TimeUnit.MILLISECONDS).flatMap(b.b).observeOn(d.a).subscribe(new k(this), new j(this));
       return;
    }
}
