package com.kwai.feature.component.entry.view.SearchSwitcherEntryView;
import qy5.d;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.lang.String;
import lnc.a1;
import oy5.i;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView$a;
import com.kwai.feature.component.entry.view.SearchSwitcherEntryView$b;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import android.widget.ViewSwitcher;
import qy5.e;
import android.widget.ViewSwitcher$ViewFactory;
import android.view.View$OnClickListener;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import android.widget.TextView;
import com.kwai.feature.component.entry.SearchEntryParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.feature.component.model.SearchPlaceHolderInfo;
import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import oy5.e;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import uy5.b;
import oy5.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import sy5.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.log.model.CommonParams;
import e3b.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import java.util.Objects;
import com.google.gson.JsonObject;
import oy5.e$a;
import crd.b;
import lnc.b9;
import java.lang.Boolean;
import oy5.f;
import oy5.c;
import ekd.q;
import qy5.f;
import java.util.concurrent.TimeUnit;
import brd.t;
import t45.d;
import brd.z;
import qy5.g;
import erd.g;
import io.reactivex.internal.functions.Functions;
import z1.a;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import zf6.j;
import androidx.core.content.ContextCompat;
import qy5.b;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.feature.component.entry.a;

public class SearchSwitcherEntryView extends LinearLayout implements d	// class@00121a
{
    public b b;
    public c c;
    public e d;
    public b e;
    public ViewSwitcher f;
    public TextView g;
    public SelectShapeTextView h;
    public boolean i;
    public List j;
    public int k;
    public boolean l;
    public int m;
    public a n;
    public String o;
    public String p;
    public String q;
    public b r;
    public i s;
    public String t;
    public final m u;
    public final m v;

    public void SearchSwitcherEntryView(Context p0){
       super(p0, null);
    }
    public void SearchSwitcherEntryView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = false;
       this.j = new ArrayList();
       this.l = false;
       this.m = 0;
       this.o = "UNKNOWN";
       this.q = a1.p(0x7f10454a);
       this.s = new i();
       this.t = "";
       SearchSwitcherEntryView$a uoa = new SearchSwitcherEntryView$a(this);
       this.u = uoa;
       SearchSwitcherEntryView$b uob = new SearchSwitcherEntryView$b(this);
       this.v = uob;
       a.c(p0, R.layout.arg_RES_7f0d08a6, this);
       ViewSwitcher viewSwitcher = this.findViewById(R.id.switcher);
       this.f = viewSwitcher;
       if (viewSwitcher != null) {
          viewSwitcher.setFactory(new e(this));
          this.f.setOnClickListener(uoa);
       }
       SelectShapeTextView selectShapeT = this.findViewById(R.id.right_icon);
       this.h = selectShapeT;
       if (selectShapeT != null) {
          selectShapeT.setOnClickListener(uob);
       }
       this.j();
       return;
    }
    public final void a(SearchEntryParams p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherEntryView.class, "26")) {
          return;
       }
       SearchPlaceHolderInfo currentHolde = this.getCurrentHolderInfo();
       if (currentHolde != null) {
          if (currentHolde.isListIdValid()) {
             p0.setSessionId(currentHolde.mQueryListId).placeHolderSession(currentHolde.mQueryListId);
          }
          p0.placeHolder(currentHolde.mSearchPlaceholder).placeHolderKeyword(currentHolde.mSearchKeyword);
       }
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherEntryView.class, "13")) {
          return;
       }
       if (!this.i(p0)) {
          return;
       }
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          SearchPlaceHolderInfo searchPlaceH = new SearchPlaceHolderInfo(iterator.next());
          searchPlaceH.mQueryListId = this.getPresetUssId();
          this.j.add(searchPlaceH);
       }
       this.l(0);
       return;
    }
    public void c(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherEntryView.class, "14")) {
          return;
       }
       if (!this.i(p0)) {
          return;
       }
       this.j.addAll(p0);
       this.l(0);
       return;
    }
    public e d(int p0,int p1){
       SearchSwitcherEntryView obj;
       SearchEntryParams mEntrySource;
       i a;
       FeedLogCtx feedLogCtx;
       ClientContent$ContentPackage uContentPack1;
       SearchPlaceHolderInfo currentHolde;
       if (PatchProxy.isSupport(SearchSwitcherEntryView.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, SearchSwitcherEntryView.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.b;
       e uoe = null;
       String str = " action:";
       String str1 = "SearchSwitcherEntryView";
       if (obj == null) {
          b.c(str1, "buildEntryContext, mISearchActionCallback is null, location:"+p0+str+p1);
          return uoe;
       }else {
          SearchEntryParams searchEntryP = obj.a(p0);
          i oi = this.b.b(p0, p1);
          String str2 = "location:";
          if (searchEntryP == null) {
             b.c(str1, str2+p0+str+p1+"entryParams is null");
          }
          if (oi == null) {
             b.c(str1, str2+p0+str+p1+"logParams is null");
          }
          if (!PatchProxy.isSupport(SearchSwitcherEntryView.class) || !PatchProxy.applyVoidFourRefs(searchEntryP, oi, Integer.valueOf(p0), Integer.valueOf(p1), this, SearchSwitcherEntryView.class, "25")) {
             int i = 2;
             if (searchEntryP != null) {
                mEntrySource = searchEntryP.mEntrySource;
                if (p0 == i) {
                   String currentWordS = (TextUtils.x(this.getCurrentSearchWord()))? this.getCurrentWordShowMsg(): this.getCurrentSearchWord();
                   searchEntryP.query(currentWordS);
                   this.a(searchEntryP);
                }else if(!this.f()){
                   this.a(searchEntryP);
                   searchEntryP.linkUrl(this.getCurrentSearchHomeUri());
                }
             }else {
                mEntrySource = "UNKNOWN";
             }
             if (oi != null) {
                a uoa1 = a.k();
                a = oi.a;
                if (a != null) {
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.photoPackage = w1.f(a.mEntity);
                   feedLogCtx = a.getFeedLogCtx();
                   uContentPack1 = uContentPack;
                   uoe = a.b(a);
                }else {
                   feedLogCtx = uoe;
                   uContentPack1 = feedLogCtx;
                }
                Objects.requireNonNull(mEntrySource);
                int i1 = -1;
                switch (mEntrySource.hashCode()){
                    case 0x87bdbefe:
                      if (mEntrySource.equals("search_entrance_placehoder_mall")) {
                         i1 = 0;
                      }
                      break;
                    case 0xad34d835:
                      if (mEntrySource.equals("search_entrance_commodity_detail")) {
                         i1 = 1;
                      }
                      break;
                    case 0x6f96977:
                      if (mEntrySource.equals("search_entrance_livesquare_tab_direct")) {
                         i1 = 2;
                      }
                      break;
                    case 0x1f7c29a7:
                      if (mEntrySource.equals("search_entrance_ksstore")) {
                         i1 = 3;
                      }
                      break;
                    case 0x4084551b:
                      if (mEntrySource.equals("search_entrance_livesquare")) {
                         i1 = 4;
                      }
                      break;
                    case 0x44e3a69b:
                      if (mEntrySource.equals("search_entrance_ksstore_placehoder")) {
                         i1 = 5;
                      }
                      break;
                    case 0x6e105f52:
                      if (mEntrySource.equals("search_entrance_bar_mall")) {
                         i1 = 6;
                      }
                      break;
                    default:
                }
                switch (i1){
                    case 0:
                    case 3:
                    case 5:
                    case 6:
                    case 1:
                      currentHolde = this.getCurrentHolderInfo();
                      if (!PatchProxy.applyVoidTwoRefs(uoa1, currentHolde, this, SearchSwitcherEntryView.class, "19") && uoa1 != null) {
                         if (!TextUtils.x(currentHolde.mQueryId)) {
                            uoa1.e("query_id", currentHolde.mQueryId);
                         }
                         uoa1.e("query_name", currentHolde.getShowMsg());
                         if (currentHolde.isListIdValid()) {
                            uoa1.e("query_list_id", currentHolde.mQueryListId);
                         }
                      }
                      break;
                    case 2:
                    case 4:
                      if (p1 == i) {
                         if (!TextUtils.n(a1.p(0x7f102c97), this.getCurrentWordShowMsg())) {
                            uoa1.e("query_name", this.getCurrentWordShowMsg());
                            currentHolde = this.getCurrentHolderInfo();
                            if (currentHolde != null && currentHolde.isListIdValid()) {
                               uoa1.e("query_list_id", currentHolde.mQueryListId);
                            }
                         }
                         if (TextUtils.n(mEntrySource, "search_entrance_newhashtag")) {
                            this.d.f().c.c0("type", "TAG");
                         }
                      }
                      break;
                    default:
                }
             label_01de :
                uoa1.e("entry_source", mEntrySource);
                uoa1.h(oi.c);
                oi.c = uoa1.j();
                if (oi.d == null) {
                   oi.d = uoe;
                }
                if (oi.f == null) {
                   oi.f = feedLogCtx;
                }
                if (oi.e == null) {
                   oi.e = uContentPack1;
                }
             }
          }
       label_0200 :
          e$a uoa = new e$a();
          uoa.b(searchEntryP);
          uoa.c(oi);
          return uoa.a();
       }
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, SearchSwitcherEntryView.class, "4")) {
          return;
       }
       this.l = false;
       b9.a(this.e);
       return;
    }
    public boolean f(){
       Object obj = PatchProxy.apply(null, this, SearchSwitcherEntryView.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return TextUtils.n(this.q, this.getCurrentWordShowMsg());
    }
    public void g(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherEntryView.class, "17")) {
          return;
       }
       this.d = this.d(1, 2);
       if (TextUtils.x(p0)) {
          p0 = f.d(this.d, 2);
       }
       this.o = p0;
       f.f(p0, this.d);
       return;
    }
    public SearchPlaceHolderInfo getCurrentHolderInfo(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, SearchSwitcherEntryView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.k < this.j.size()) {
          objArray = this.j.get(this.k);
       }
       return objArray;
    }
    public final String getCurrentSearchHomeUri(){
       SearchPlaceHolderInfo obj = PatchProxy.apply(null, this, SearchSwitcherEntryView.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getCurrentHolderInfo();
       if (obj != null) {
          return obj.mJumpUrl;
       }
       return null;
    }
    public String getCurrentSearchWord(){
       SearchPlaceHolderInfo obj = PatchProxy.apply(null, this, SearchSwitcherEntryView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getCurrentHolderInfo();
       String realSearchMs = (obj != null)? obj.getRealSearchMsg(): "";
       return realSearchMs;
    }
    public String getCurrentSearchWordListId(){
       String str;
       SearchPlaceHolderInfo obj = PatchProxy.apply(null, this, SearchSwitcherEntryView.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getCurrentHolderInfo();
       obj = (obj != null && obj.isListIdValid())? obj.mQueryListId: "";
       return obj;
    }
    public String getCurrentWordShowMsg(){
       SearchPlaceHolderInfo obj = PatchProxy.apply(null, this, SearchSwitcherEntryView.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getCurrentHolderInfo();
       String showMsg = (obj != null)? obj.getShowMsg(): "";
       return showMsg;
    }
    public String getPresetRequestExtParams(){
       return this.p;
    }
    public String getPresetUssId(){
       return this.t;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, SearchSwitcherEntryView.class, "16")) {
          return;
       }
       SearchSwitcherEntryView tc = this.c;
       if (tc != null) {
          tc.F2();
          this.m = 0;
       }
       return;
    }
    public final boolean i(List p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, SearchSwitcherEntryView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.k = 0;
       this.m = 0;
       this.j.clear();
       if (!q.f(p0)) {
          return true;
       }
       this.j();
       return 0;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, SearchSwitcherEntryView.class, "1")) {
          return;
       }
       this.k = 0;
       if (this.j.isEmpty()) {
          this.j.add(new SearchPlaceHolderInfo(a1.p(R.string.arg_RES_7f10454a)));
       }
       this.f.getNextView().findViewById(R.id.search_content).setText(this.j.get(this.k).getShowMsg());
       this.n = new f(this);
       this.f.showNext();
       return;
    }
    public void k(int p0){
       if (PatchProxy.isSupport(SearchSwitcherEntryView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchSwitcherEntryView.class, "3")) {
          return;
       }
       this.l = true;
       long l = (!p0)? 5: (long)p0;
       this.e = t.interval(l, TimeUnit.SECONDS).observeOn(d.a).subscribe(new g(this), Functions.d());
       return;
    }
    public final void l(int p0){
       if (PatchProxy.isSupport(SearchSwitcherEntryView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, SearchSwitcherEntryView.class, "2")) {
          return;
       }
       if (this.j.size() < 1) {
          return;
       }
       p0 = p0 % this.j.size();
       this.k = p0;
       SearchPlaceHolderInfo searchPlaceH = this.j.get(p0);
       TextView textView = this.f.getNextView().findViewById(R.id.search_content);
       this.g = textView;
       if (textView != null) {
          textView.setText(searchPlaceH.getShowMsg());
       }
       SearchSwitcherEntryView tn = this.n;
       if (tn != null) {
          tn.accept(searchPlaceH);
       }
       this.f.showNext();
       return;
    }
    public void m(boolean p0){
       if (PatchProxy.isSupport(SearchSwitcherEntryView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchSwitcherEntryView.class, "21")) {
          return;
       }
       for (int i = 0; i < this.f.getChildCount(); i = i + 1) {
          View childAt = this.f.getChildAt(i);
          ImageView imageView = childAt.findViewById(R.id.left_icon);
          TextView textView = childAt.findViewById(R.id.search_content);
          Context context = this.getContext();
          int i1 = 0x7f0823d8;
          int i2 = (p0)? 0x7f060625: 0x7f06168c;
          Drawable uDrawable = j.n(context, i1, i2);
          uDrawable.setBounds(0, 0, uDrawable.getIntrinsicWidth(), uDrawable.getIntrinsicHeight());
          imageView.setImageDrawable(uDrawable);
          int color = (p0)? ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f060625): ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f06168c);
          textView.setTextColor(color);
       }
       return;
    }
    public boolean performClick(){
       Object obj = PatchProxy.apply(null, this, SearchSwitcherEntryView.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       this.f.performClick();
       return true;
    }
    public void setClickable(boolean p0){
       if (PatchProxy.isSupport(SearchSwitcherEntryView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, SearchSwitcherEntryView.class, "22")) {
          return;
       }
       super.setClickable(p0);
       this.f.setClickable(p0);
       this.h.setClickable(p0);
       if (p0) {
          this.f.setOnClickListener(this.u);
          if (this.i != null) {
             this.h.setOnClickListener(this.v);
          }else {
             this.h.setOnClickListener(this.u);
          }
       }else {
          this.f.setOnClickListener(null);
          this.h.setOnClickListener(null);
       }
       return;
    }
    public void setPlaceHolder(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherEntryView.class, "11")) {
          return;
       }
       SearchSwitcherEntryView tg = this.g;
       if (tg != null) {
          this.q = p0;
          tg.setText(p0);
       }
       return;
    }
    public void setPresetRequestExtParams(String p0){
       this.p = p0;
    }
    public void setPresetUssId(String p0){
       this.t = p0;
    }
    public void setRightBtnEnable(Boolean p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherEntryView.class, "12")) {
          return;
       }
       boolean b = p0.booleanValue();
       this.i = b;
       if (!b) {
          SearchSwitcherEntryView th = this.h;
          if (th != null) {
             th.setOnClickListener(this.u);
          }
       }
       return;
    }
    public void setSearchActionCallback(b p0){
       this.b = p0;
    }
    public void setSearchEntryLayoutConfig(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchSwitcherEntryView.class, "20")) {
          return;
       }
       if (p0 == this.r) {
          return;
       }
       this.r = p0;
       for (int i = 0; i < this.f.getChildCount(); i++) {
          View childAt = this.f.getChildAt(i);
          a.a(this.r, childAt.findViewById(R.id.search_bar_entry), childAt.findViewById(R.id.left_icon), childAt.findViewById(R.id.search_content), null, this.h);
       }
       return;
    }
    public void setSearchEntryRequestCallback(c p0){
       this.c = p0;
    }
}
