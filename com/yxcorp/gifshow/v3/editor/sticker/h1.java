package com.yxcorp.gifshow.v3.editor.sticker.h1;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.v3.editor.sticker.g1;
import java.lang.Iterable;
import ok.o;
import qk.y;
import com.kuaishou.edit.draft.Workspace$Type;
import java.util.Date;
import java.lang.Boolean;
import java.util.Iterator;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import java.io.File;
import itc.k3;
import qkd.b;
import com.yxcorp.gifshow.v3.editor.sticker.f0;
import itc.p3;
import java.lang.Runnable;
import ekd.k1;
import pkd.a;
import java.lang.NullPointerException;
import lnc.e0;
import android.net.Uri;
import ekd.w0;
import ekd.a0;
import java.util.Objects;
import com.kuaishou.edit.draft.Workspace;
import com.kuaishou.edit.draft.Workspace$From;
import com.kwai.sdk.switchconfig.a;
import h80.c;
import h80.k;
import com.yxcorp.gifshow.v3.f;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import qe6.c;
import java.lang.reflect.Type;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;

public final class h1	// class@001254
{
    public static int a;
    public static Date b;
    public static List c;
    public static List d;

    static {
       h1.c = new ArrayList();
       h1.d = Lists.b();
    }
    public void h1(){
       super();
    }
    public static void a(){
       h1.b = null;
    }
    public static void b(){
       if (PatchProxy.applyVoid(null, null, h1.class, "4")) {
          return;
       }
       h1.d.clear();
       return;
    }
    public static List c(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, h1.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (q.f(p0)) {
          return obj;
       }
       return Lists.c(y.h(p0, g1.b));
    }
    public static boolean d(Workspace$Type p0){
       boolean b = (p0 != Workspace$Type.KTV_SONG && (p0 == Workspace$Type.KUAISHAN || p0 == Workspace$Type.AI_CUT))? true: false;
       return b;
    }
    public static Date e(){
       return h1.b;
    }
    public static List f(List p0,boolean p1){
       ArrayList obj;
       h1 oh1 = h1.class;
       if (PatchProxy.isSupport(oh1)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, oh1, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = Lists.b();
       if (q.f(p0)) {
          return obj;
       }else {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             StickerDetailInfo stickerDetai = iterator.next();
             if (p1 && (stickerDetai.mStickerResourceType == 2 || (stickerDetai.mStickerType == 1 && !b.S(k3.r())))) {
                continue ;
             }else if(("15").equals(stickerDetai.mRelatedClientId)){
                if (k3.a()) {
                   obj.add(stickerDetai);
                }
             }else if(q.f(stickerDetai.mResourceUrls)){
                obj.add(stickerDetai);
             }else if(h1.i(stickerDetai) && !f0.n(stickerDetai)){
                k1.o(new p3(stickerDetai));
             }else {
                obj.add(stickerDetai);
             }
          }
          return obj;
       }
    }
    public static String g(StickerDetailInfo p0){
       object oobject;
       Object obj = null;
       String obj1 = PatchProxy.applyOneRefs(p0, obj, h1.class, "10");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = "";
       if (p0 == null) {
          if (!a.a) {
             return obj1;
          }else {
             throw new NullPointerException("sticker info is null");
          }
       }else {
          String[] stringArray = e0.a(p0.mResourceUrls, obj);
          if (stringArray.length > 0) {
             oobject = stringArray[0];
          }
          return a0.c(w0.f(oobject).getPath());
       }
    }
    public static int h(){
       return h1.a;
    }
    public static boolean i(StickerDetailInfo p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h1.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.mStickerType != true) {
          return false;
       }
       p0 = p0.mRelatedClientId;
       Objects.requireNonNull(p0);
       int i = -1;
       switch (p0.hashCode()){
           case '1':
             if (p0.equals("1")) {
                i = 0;
             }
             break;
           case '2':
             if (p0.equals("2")) {
                i = 1;
             }
             break;
           case '3':
             if (p0.equals("3")) {
                i = 2;
             }
             break;
           case 1569:
             if (p0.equals("12")) {
                i = 3;
             }
             break;
           case 1570:
             if (p0.equals("13")) {
                i = 4;
             }
             break;
           default:
       }
       switch (i){
           case 0:
           case 2:
           case 3:
           case 4:
           case 1:
           default:
             return false;
       }
       return true;
    }
    public static boolean j(Workspace p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h1.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0.getFrom() != Workspace$From.IM_SEND_MESSAGE && (p0.getFrom() != Workspace$From.IM_SEND_MESSAGE_WHATS_UP && p0.getFrom() != Workspace$From.IM_TAKE_IN_SAME))? true: false;
       return b;
    }
    public static boolean k(Workspace p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, h1.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!a.t().d("enableVoteSticker", b) || (!k.a().d().booleanValue() || (f.B(p0.getType()) || (p0.getFrom() == Workspace$From.IM_SEND_MESSAGE || (p0.getFrom() == Workspace$From.IM_SEND_MESSAGE_WHATS_UP || p0.getFrom() == Workspace$From.IM_TAKE_IN_SAME))))) {
          b = false;
       }
       return b;
    }
    public static void l(StickerDetailInfo p0){
       h1 oh1 = h1.class;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, oh1, "16")) {
          return;
       }
       h1.c.remove(p0.mStickerId);
       h1.c.add(0, p0.mStickerId);
       p0 = p0.mStickerId;
       if (!PatchProxy.applyVoidOneRefs(p0, obj, oh1, "2") && !TextUtils.x(p0)) {
          if (q.f(h1.d)) {
             List list = a.A0(c.d1);
             if (!q.f(list)) {
                h1.d.addAll(list);
             }
          }
          h1.d.remove(p0);
          h1.d.add(0, p0);
       }
       return;
    }
    public static void m(){
       if (PatchProxy.applyVoid(null, null, h1.class, "3")) {
          return;
       }
       if (!q.f(h1.d)) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putString("used_sticker_sequence", b.e(h1.d));
          g.a(uEditor);
       }
       return;
    }
    public static void n(int p0){
       h1.a = p0;
    }
    public static void o(){
       if (PatchProxy.applyVoid(null, null, h1.class, "14")) {
          return;
       }
       h1.b = new Date();
       return;
    }
}
