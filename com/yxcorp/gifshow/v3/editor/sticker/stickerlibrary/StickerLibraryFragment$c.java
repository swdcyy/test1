package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$c;
import java.util.List;
import java.util.Set;
import mrd.a;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$d;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import x59.e$d;

public class StickerLibraryFragment$c	// class@001297
{
    public final List a;
    public final Set b;
    public final a c;
    public final StickerLibraryFragment$d d;
    public e$d e;
    public boolean f;
    public StickerGroupInfo g;

    public void StickerLibraryFragment$c(List p0,Set p1,a p2,StickerLibraryFragment$d p3){
       super();
       this.f = false;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public StickerLibraryFragment$c a(StickerGroupInfo p0){
       this.g = p0;
       return this;
    }
    public StickerLibraryFragment$c b(boolean p0){
       this.f = p0;
       return this;
    }
    public StickerLibraryFragment$c c(e$d p0){
       this.e = p0;
       return this;
    }
}
