package com.smile.gifshow.post.profile.MiYouImageSelectSupplier$b;
import erd.o;
import com.smile.gifshow.post.profile.MiYouImageSelectSupplier;
import w69.i;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$ImageSelectType;
import java.lang.Object;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier$Type;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import com.yxcorp.gifshow.widget.popup.KwaiDialogOption;
import com.tbruyelle.rxpermissions2.g;
import android.app.Activity;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import com.smile.gifshow.post.profile.d;

public final class MiYouImageSelectSupplier$b implements o	// class@000c57
{
    public final MiYouImageSelectSupplier b;
    public final i c;
    public final ImageSelectSupplier$ImageSelectType d;

    public void MiYouImageSelectSupplier$b(MiYouImageSelectSupplier p0,i p1,ImageSelectSupplier$ImageSelectType p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       a.p(p0, "type");
       ImageSelectSupplier$Type gALLERY = ImageSelectSupplier$Type.GALLERY;
       String str = (p0 == gALLERY)? "android.permission.WRITE_EXTERNAL_STORAGE": "android.permission.CAMERA";
       String str1 = str;
       int i = (p0 == gALLERY)? 0x7f103bd5: 0x7f100494;
       int i1 = (p0 == gALLERY)? 0x7f103bcf: 0x7f100493;
       MiYouImageSelectSupplier$b tb = this.b;
       return a.i(tb.l, tb.m, str1, i, i1, KwaiDialogOption.d).flatMap(new d(this, p0));
    }
}
