package androidx.appcompat.widget.SearchView;
import u0.c;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.os.Build$VERSION;
import androidx.appcompat.widget.SearchView$n;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import androidx.appcompat.widget.SearchView$b;
import androidx.appcompat.widget.SearchView$c;
import java.util.WeakHashMap;
import androidx.appcompat.widget.SearchView$f;
import androidx.appcompat.widget.SearchView$g;
import androidx.appcompat.widget.SearchView$h;
import androidx.appcompat.widget.SearchView$i;
import androidx.appcompat.widget.SearchView$j;
import androidx.appcompat.widget.SearchView$a;
import ll8.c$b;
import w0.x;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import a2.i0;
import android.content.res.Resources;
import java.lang.String;
import java.lang.CharSequence;
import w0.y;
import android.view.View$OnClickListener;
import android.widget.AutoCompleteTextView;
import android.text.TextWatcher;
import android.widget.TextView$OnEditorActionListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.view.View$OnKeyListener;
import androidx.appcompat.widget.SearchView$d;
import android.view.View$OnFocusChangeListener;
import android.content.Intent;
import androidx.appcompat.widget.SearchView$e;
import android.view.View$OnLayoutChangeListener;
import android.content.res.Configuration;
import w0.b0;
import cw9.c;
import android.net.Uri;
import android.os.Bundle;
import android.content.ComponentName;
import android.app.SearchableInfo;
import android.database.Cursor;
import androidx.appcompat.widget.g;
import java.lang.StringBuilder;
import android.app.PendingIntent;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import java.lang.Object;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import f2.a;
import android.text.Editable;
import android.text.TextUtils;
import androidx.appcompat.widget.SearchView$k;
import androidx.appcompat.widget.SearchView$m;
import androidx.appcompat.widget.SearchView$l;
import android.view.KeyEvent;
import java.lang.Runnable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.SearchView$o;
import android.view.TouchDelegate;
import android.view.View$MeasureSpec;
import java.lang.Math;
import androidx.appcompat.widget.SearchView$SavedState;
import androidx.customview.view.AbsSavedState;

public class SearchView extends LinearLayoutCompat implements c	// class@000628
{
    public Rect A;
    public Rect B;
    public int[] C;
    public int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public SearchView$l L;
    public SearchView$k M;
    public View$OnFocusChangeListener N;
    public SearchView$m O;
    public View$OnClickListener P;
    public boolean Q;
    public boolean R;
    public a S;
    public boolean T;
    public CharSequence U;
    public int U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public CharSequence W0;
    public CharSequence X0;
    public boolean Y0;
    public int Z0;
    public SearchableInfo a1;
    public Bundle b1;
    public final Runnable c1;
    public Runnable d1;
    public final WeakHashMap e1;
    public final View$OnClickListener f1;
    public View$OnKeyListener g1;
    public final TextView$OnEditorActionListener h1;
    public final AdapterView$OnItemClickListener i1;
    public final AdapterView$OnItemSelectedListener j1;
    public TextWatcher k1;
    public final SearchView$SearchAutoComplete q;
    public final View r;
    public final View s;
    public final View t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final ImageView x;
    public final View y;
    public SearchView$o z;
    public static final SearchView$n l1;

    static {
       SearchView$n on = (Build$VERSION.SDK_INT < 29)? new SearchView$n(): null;
       SearchView.l1 = on;
    }
    public void SearchView(Context p0){
       super(p0, null);
    }
    public void SearchView(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0407de);
    }
    public void SearchView(Context p0,AttributeSet p1,int p2){
       SearchView searchView = this;
       super(p0, p1, p2);
       searchView.A = new Rect();
       searchView.B = new Rect();
       int[] ointArray = new int[2];
       searchView.C = ointArray;
       ointArray = new int[2];
       searchView.D = ointArray;
       searchView.c1 = new SearchView$b(searchView);
       searchView.d1 = new SearchView$c(searchView);
       searchView.e1 = new WeakHashMap();
       SearchView$f uof = new SearchView$f(searchView);
       searchView.f1 = uof;
       searchView.g1 = new SearchView$g(searchView);
       SearchView$h oh = new SearchView$h(searchView);
       searchView.h1 = oh;
       SearchView$i oi = new SearchView$i(searchView);
       searchView.i1 = oi;
       SearchView$j oj = new SearchView$j(searchView);
       searchView.j1 = oj;
       searchView.k1 = new SearchView$a(searchView);
       x ox = x.v(p0, p1, c$b.T4, p2, 0);
       a.c(LayoutInflater.from(p0), ox.n(9, R.layout.arg_RES_7f0d0019), searchView, true);
       SearchView$SearchAutoComplete searchAutoCo = searchView.findViewById(R.id.search_src_text);
       searchView.q = searchAutoCo;
       searchAutoCo.setSearchView(searchView);
       searchView.r = searchView.findViewById(0x7f0a377e);
       View view = searchView.findViewById(R.id.search_plate);
       searchView.s = view;
       View view1 = searchView.findViewById(R.id.submit_area);
       searchView.t = view1;
       ImageView imageView = searchView.findViewById(R.id.search_button);
       searchView.u = imageView;
       ImageView imageView1 = searchView.findViewById(R.id.search_go_btn);
       searchView.v = imageView1;
       ImageView imageView2 = searchView.findViewById(R.id.search_close_btn);
       searchView.w = imageView2;
       ImageView imageView3 = searchView.findViewById(R.id.search_voice_btn);
       searchView.x = imageView3;
       ImageView imageView4 = searchView.findViewById(R.id.search_mag_icon);
       searchView.E = imageView4;
       i0.v0(view, ox.g(10));
       i0.v0(view1, ox.g(14));
       imageView.setImageDrawable(ox.g(13));
       imageView1.setImageDrawable(ox.g(7));
       imageView2.setImageDrawable(ox.g(4));
       imageView3.setImageDrawable(ox.g(16));
       imageView4.setImageDrawable(ox.g(13));
       searchView.F = ox.g(12);
       y.a(imageView, this.getResources().getString(R.string.arg_RES_7f100023));
       searchView.G = ox.n(15, 0x7f0d0018);
       searchView.H = ox.n(5, 0);
       imageView.setOnClickListener(uof);
       imageView2.setOnClickListener(uof);
       imageView1.setOnClickListener(uof);
       imageView3.setOnClickListener(uof);
       searchAutoCo.setOnClickListener(uof);
       searchAutoCo.addTextChangedListener(searchView.k1);
       searchAutoCo.setOnEditorActionListener(oh);
       searchAutoCo.setOnItemClickListener(oi);
       searchAutoCo.setOnItemSelectedListener(oj);
       searchAutoCo.setOnKeyListener(searchView.g1);
       searchAutoCo.setOnFocusChangeListener(new SearchView$d(searchView));
       int b = true;
       searchView.setIconifiedByDefault(ox.a(8, b));
       int i = -1;
       int i1 = ox.f(b, i);
       if (i1 != i) {
          searchView.setMaxWidth(i1);
       }
       searchView.K = ox.p(6);
       searchView.U = ox.p(11);
       b = ox.k(3, i);
       if (b != i) {
          searchView.setImeOptions(b);
       }
       b = ox.k(2, i);
       if (b != i) {
          searchView.setInputType(b);
       }
       searchView.setFocusable(ox.a(0, true));
       ox.w();
       Intent intent = new Intent("android.speech.action.WEB_SEARCH");
       searchView.I = intent;
       b = 0x10000000;
       intent.addFlags(b);
       intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
       intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
       searchView.J = intent;
       intent.addFlags(b);
       View view2 = searchView.findViewById(searchAutoCo.getDropDownAnchor());
       searchView.y = view2;
       if (view2 != null) {
          view2.addOnLayoutChangeListener(new SearchView$e(searchView));
       }
       searchView.k0(searchView.Q);
       this.g0();
       return;
    }
    public static boolean M(Context p0){
       boolean b = (p0.getResources().getConfiguration().orientation == 2)? true: false;
       return b;
    }
    public void B(){
       if (this.y.getWidth() > 1) {
          Resources resources = this.getContext().getResources();
          int paddingLeft = this.s.getPaddingLeft();
          Rect rect = new Rect();
          boolean b = b0.b(this);
          int i = (this.Q != null)? c.b(resources, 0x7f07002f) + c.b(resources, 0x7f070030): 0;
          this.q.getDropDownBackground().getPadding(rect);
          int i1 = (b)? - rect.left: paddingLeft - (rect.left + i);
          this.q.setDropDownHorizontalOffset(i1);
          this.q.setDropDownWidth(((((this.y.getWidth() + rect.left) + rect.right) + i) - paddingLeft));
       }
       return;
    }
    public final Intent C(String p0,Uri p1,String p2,String p3,int p4,String p5){
       Intent intent = new Intent(p0);
       intent.addFlags(0x10000000);
       if (p1 != null) {
          intent.setData(p1);
       }
       intent.putExtra("user_query", this.X0);
       if (p3 != null) {
          intent.putExtra("query", p3);
       }
       if (p2 != null) {
          intent.putExtra("intent_extra_data_key", p2);
       }
       SearchView tb1 = this.b1;
       if (tb1 != null) {
          intent.putExtra("app_data", tb1);
       }
       if (p4) {
          intent.putExtra("action_key", p4);
          intent.putExtra("action_msg", p5);
       }
       intent.setComponent(this.a1.getSearchActivity());
       return intent;
    }
    public final Intent D(Cursor p0,int p1,String p2){
       int i = 0;
       try{
          String str = g.n(p0, "suggest_intent_action");
          if (str == null) {
             str = this.a1.getSuggestIntentAction();
          }
          if (str == null) {
             str = "android.intent.action.SEARCH";
          }
          String str1 = str;
          str = g.n(p0, "suggest_intent_data");
          if (str == null) {
             str = this.a1.getSuggestIntentData();
          }
          if (str != null) {
             String str2 = g.n(p0, "suggest_intent_data_id");
             if (str2 != null) {
                str = str+"/"+Uri.encode(str2);
             }
          }
          Uri uri = (str == null)? i: Uri.parse(str);
          return this.C(str1, uri, g.n(p0, "suggest_intent_extra_data"), g.n(p0, "suggest_intent_query"), p1, p2);
       }catch(java.lang.RuntimeException e0){
          try{
             p0.getPosition();
             return e0;
          }catch(java.lang.RuntimeException e0){
          }
       }
    }
    public final Intent E(Intent p0,SearchableInfo p1){
       ComponentName searchActivi = p1.getSearchActivity();
       Intent intent = new Intent("android.intent.action.SEARCH");
       intent.setComponent(searchActivi);
       PendingIntent activity = PendingIntent.getActivity(this.getContext(), 0, intent, 0x40000000);
       Bundle uBundle = new Bundle();
       SearchView tb1 = this.b1;
       if (tb1 != null) {
          uBundle.putParcelable("app_data", tb1);
       }
       Intent intent1 = new Intent(p0);
       int i = 1;
       Resources resources = this.getResources();
       String str = (p1.getVoiceLanguageModeId())? resources.getString(p1.getVoiceLanguageModeId()): "free_form";
       String str1 = null;
       String str2 = (p1.getVoicePromptTextId())? resources.getString(p1.getVoicePromptTextId()): str1;
       String str3 = (p1.getVoiceLanguageId())? resources.getString(p1.getVoiceLanguageId()): str1;
       if (p1.getVoiceMaxResults()) {
          i = p1.getVoiceMaxResults();
       }
       intent1.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
       intent1.putExtra("android.speech.extra.PROMPT", str2);
       intent1.putExtra("android.speech.extra.LANGUAGE", str3);
       intent1.putExtra("android.speech.extra.MAX_RESULTS", i);
       if (searchActivi != null) {
          str1 = searchActivi.flattenToShortString();
       }
       intent1.putExtra("calling_package", str1);
       intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
       intent1.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", uBundle);
       return intent1;
    }
    public final Intent F(Intent p0,SearchableInfo p1){
       Intent intent = new Intent(p0);
       ComponentName searchActivi = p1.getSearchActivity();
       String str = (searchActivi == null)? null: searchActivi.flattenToShortString();
       intent.putExtra("calling_package", str);
       return intent;
    }
    public final void G(){
       this.q.dismissDropDown();
    }
    public void H(){
       if (Build$VERSION.SDK_INT >= 29) {
          this.q.refreshAutoCompleteResults();
       }else {
          SearchView$n l1 = SearchView.l1;
          l1.b(this.q);
          l1.a(this.q);
       }
       return;
    }
    public final void I(View p0,Rect p1){
       p0.getLocationInWindow(this.C);
       this.getLocationInWindow(this.D);
       SearchView tC = this.C;
       SearchView tD = this.D;
       int i = tC[1] - tD[1];
       int i1 = tC[0] - tD[0];
       p1.set(i1, i, (p0.getWidth() + i1), (p0.getHeight() + i));
    }
    public final CharSequence J(CharSequence p0){
       if (this.Q == null || this.F == null) {
          return p0;
       }
       this.F.setBounds(0, 0, (int)((double)this.q.getTextSize() * 0x3ff4000000000000), (int)((double)this.q.getTextSize() * 0x3ff4000000000000));
       SpannableStringBuilder spannableStr = new SpannableStringBuilder("   ");
       spannableStr.setSpan(new ImageSpan(this.F), 1, 2, 33);
       spannableStr.append(p0);
       return spannableStr;
    }
    public final boolean K(){
       SearchView ta1 = this.a1;
       boolean b = false;
       if (ta1 != null && ta1.getVoiceSearchEnabled()) {
          ta1 = null;
          if (this.a1.getVoiceSearchLaunchWebSearch()) {
             ta1 = this.I;
          }else if(this.a1.getVoiceSearchLaunchRecognizer()){
             ta1 = this.J;
          }
          if (ta1 != null && this.getContext().getPackageManager().resolveActivity(ta1, 0x10000) != null) {
             b = true;
          }
       }
    label_0034 :
       return b;
    }
    public boolean L(){
       return this.R;
    }
    public final boolean N(){
       boolean b = (this.T != null || (this.V0 != null && !this.L()))? true: false;
       return b;
    }
    public final void O(Intent p0){
       if (p0 == null) {
          return;
       }
       try{
          this.getContext().startActivity(p0);
       }catch(java.lang.RuntimeException e0){
          "Failed launch activity: "+p0;
       }
       return;
    }
    public void P(int p0,String p1,String p2){
       this.getContext().startActivity(this.C("android.intent.action.SEARCH", null, null, p2, p0, null));
    }
    public final boolean Q(int p0,int p1,String p2){
       Cursor cursor = this.S.getCursor();
       if (cursor == null || !cursor.moveToPosition(p0)) {
          return false;
       }
       this.O(this.D(cursor, p1, null));
       return true;
    }
    public void R(){
       if (TextUtils.isEmpty(this.q.getText())) {
          if (this.Q != null) {
             SearchView tM = this.M;
             if (tM == null || !tM.onClose()) {
                this.clearFocus();
                this.k0(true);
             }
          }
       }else {
          this.q.setText("");
          this.q.requestFocus();
          this.q.setImeVisibility(true);
       }
       return;
    }
    public boolean S(int p0,int p1,String p2){
       SearchView tO = this.O;
       if (tO != null && tO.a(p0)) {
          return 0;
       }
       this.Q(p0, 0, null);
       this.q.setImeVisibility(0);
       this.G();
       return true;
    }
    public boolean T(int p0){
       SearchView tO = this.O;
       if (tO != null && tO.b(p0)) {
          return false;
       }
       this.c0(p0);
       return true;
    }
    public void U(CharSequence p0){
       this.setQuery(p0);
    }
    public void V(){
       this.k0(false);
       this.q.requestFocus();
       this.q.setImeVisibility(true);
       SearchView tP = this.P;
       if (tP != null) {
          tP.onClick(this);
       }
       return;
    }
    public void W(){
       Editable text = this.q.getText();
       if (text != null && TextUtils.getTrimmedLength(text) > 0) {
          SearchView tL = this.L;
          if (tL == null || !tL.a(text.toString())) {
             if (this.a1 != null) {
                this.P(0, null, text.toString());
             }
             this.q.setImeVisibility(0);
             this.G();
          }
       }
       return;
    }
    public boolean X(View p0,int p1,KeyEvent p2){
       if (this.a1 == null) {
          return false;
       }
       if (this.S == null) {
          return false;
       }
       if (!p2.getAction() && p2.hasNoModifiers()) {
          if (p1 != 66 && (p1 == 84 || p1 == 61)) {
             return this.S(this.q.getListSelection(), false, null);
          }else {
             int i = 21;
             if (p1 == i || p1 == 22) {
                i = (p1 == i)? 0: this.q.length();
                this.q.setSelection(i);
                this.q.setListSelection(false);
                this.q.clearListSelection();
                this.q.a();
                return true;
             }else if(p1 == 19){
                this.q.getListSelection();
                return false;
             }
          }
       }
       return false;
    }
    public void Y(CharSequence p0){
       Editable text = this.q.getText();
       this.X0 = text;
       int i = TextUtils.isEmpty(text) ^ 0x01;
       this.j0(i);
       this.l0((i ^ 0x01));
       this.e0();
       this.i0();
       if (this.L != null && !TextUtils.equals(p0, this.W0)) {
          this.L.b(p0.toString());
       }
       this.W0 = p0.toString();
       return;
    }
    public void Z(){
       this.k0(this.L());
       this.b0();
       if (this.q.hasFocus()) {
          this.H();
       }
       return;
    }
    public void a0(){
       SearchView ta1 = this.a1;
       if (ta1 == null) {
          return;
       }
       try{
          if (ta1.getVoiceSearchLaunchWebSearch()) {
             this.getContext().startActivity(this.F(this.I, ta1));
          }else if(ta1.getVoiceSearchLaunchRecognizer()){
             this.getContext().startActivity(this.E(this.J, ta1));
          }
          return;
       }catch(android.content.ActivityNotFoundException e0){
       }
    }
    public final void b0(){
       this.post(this.c1);
    }
    public void c(){
       this.d0("", false);
       this.clearFocus();
       this.k0(true);
       this.q.setImeOptions(this.Z0);
       this.Y0 = false;
    }
    public final void c0(int p0){
       Editable text = this.q.getText();
       Cursor cursor = this.S.getCursor();
       if (cursor == null) {
          return;
       }
       if (cursor.moveToPosition(p0)) {
          CharSequence uCharSequenc = this.S.a(cursor);
          if (uCharSequenc != null) {
             this.setQuery(uCharSequenc);
          }else {
             this.setQuery(text);
          }
       }else {
          this.setQuery(text);
       }
       return;
    }
    public void clearFocus(){
       this.W = true;
       super.clearFocus();
       this.q.clearFocus();
       this.q.setImeVisibility(false);
       this.W = false;
    }
    public void d0(CharSequence p0,boolean p1){
       this.q.setText(p0);
       SearchView tq = this.q;
       tq.setSelection(tq.length());
       this.X0 = p0;
       if (p1 && !TextUtils.isEmpty(p0)) {
          this.W();
       }
       return;
    }
    public final void e0(){
       int i = 1;
       int i1 = TextUtils.isEmpty(this.q.getText()) ^ i;
       int i2 = 0;
       if (!i1 && (this.Q == null || this.Y0 != null)) {
          i = 0;
       }
       SearchView tw = this.w;
       if (!i) {
          i2 = 8;
       }
       tw.setVisibility(i2);
       Drawable drawable = this.w.getDrawable();
       if (drawable != null) {
          int[] eNABLED_STAT = (i1)? ViewGroup.ENABLED_STATE_SET: ViewGroup.EMPTY_STATE_SET;
          drawable.setState(eNABLED_STAT);
       }
       return;
    }
    public void f(){
       if (this.Y0 != null) {
          return;
       }
       this.Y0 = true;
       int imeOptions = this.q.getImeOptions();
       this.Z0 = imeOptions;
       this.q.setImeOptions((imeOptions | 0x2000000));
       this.q.setText("");
       this.setIconified(false);
       return;
    }
    public void f0(){
       int[] fOCUSED_STAT = (this.q.hasFocus())? ViewGroup.FOCUSED_STATE_SET: ViewGroup.EMPTY_STATE_SET;
       Drawable background = this.s.getBackground();
       if (background != null) {
          background.setState(fOCUSED_STAT);
       }
       background = this.t.getBackground();
       if (background != null) {
          background.setState(fOCUSED_STAT);
       }
       this.invalidate();
       return;
    }
    public final void g0(){
       CharSequence queryHint = this.getQueryHint();
       SearchView tq = this.q;
       if (queryHint == null) {
          queryHint = "";
       }
       tq.setHint(this.J(queryHint));
       return;
    }
    public int getImeOptions(){
       return this.q.getImeOptions();
    }
    public int getInputType(){
       return this.q.getInputType();
    }
    public int getMaxWidth(){
       return this.U0;
    }
    public final int getPreferredHeight(){
       return c.b(this.getContext().getResources(), 0x7f07003c);
    }
    public final int getPreferredWidth(){
       return c.b(this.getContext().getResources(), 0x7f07003d);
    }
    public CharSequence getQuery(){
       return this.q.getText();
    }
    public CharSequence getQueryHint(){
       SearchView tU = this.U;
       if (tU != null) {
       }else {
          tU = this.a1;
          tU = (tU != null && tU.getHintId())? this.getContext().getText(this.a1.getHintId()): this.K;
       }
       return tU;
    }
    public int getSuggestionCommitIconResId(){
       return this.H;
    }
    public int getSuggestionRowLayout(){
       return this.G;
    }
    public a getSuggestionsAdapter(){
       return this.S;
    }
    public final void h0(){
       this.q.setThreshold(this.a1.getSuggestThreshold());
       this.q.setImeOptions(this.a1.getImeOptions());
       int inputType = this.a1.getInputType();
       int i = 1;
       if ((inputType & 0x0f) == i) {
          inputType = inputType & -65537;
          if (this.a1.getSuggestAuthority() != null) {
             inputType = (inputType | 0x10000) | 0x80000;
          }
       }
       this.q.setInputType(inputType);
       SearchView tS = this.S;
       if (tS != null) {
          tS.b(null);
       }
       if (this.a1.getSuggestAuthority() != null) {
          g og = new g(this.getContext(), this, this.a1, this.e1);
          this.S = og;
          this.q.setAdapter(og);
          tS = this.S;
          if (this.V != null) {
             i = 2;
          }
          tS.w(i);
       }
       return;
    }
    public final void i0(){
       int i = (this.N() && (!this.v.getVisibility() || !this.x.getVisibility()))? 0: 8;
       this.t.setVisibility(i);
       return;
    }
    public final void j0(boolean p0){
       int i = (this.T != null && (this.N() && (this.hasFocus() && (p0 || this.V0 == null))))? 0: 8;
       this.v.setVisibility(i);
       return;
    }
    public final void k0(boolean p0){
       this.R = p0;
       int i = 0;
       int i1 = (p0)? 0: 8;
       int i2 = TextUtils.isEmpty(this.q.getText()) ^ 0x01;
       this.u.setVisibility(i1);
       this.j0(i2);
       SearchView tr = this.r;
       int i3 = (p0)? 8: 0;
       tr.setVisibility(i3);
       if (this.E.getDrawable() == null || this.Q != null) {
          i = 8;
       }
       this.E.setVisibility(i);
       this.e0();
       this.l0((i2 ^ 0x01));
       this.i0();
       return;
    }
    public final void l0(boolean p0){
       int i = 8;
       if (this.V0 != null && (!this.L() && p0)) {
          this.v.setVisibility(i);
          i = 0;
       }
    label_0015 :
       this.x.setVisibility(i);
       return;
    }
    public void onDetachedFromWindow(){
       this.removeCallbacks(this.c1);
       this.post(this.d1);
       super.onDetachedFromWindow();
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0) {
          this.I(this.q, this.A);
          SearchView tA = this.A;
          this.B.set(tA.left, 0, tA.right, (p4 - p2));
          SearchView tz = this.z;
          if (tz == null) {
             SearchView$o oo = new SearchView$o(this.B, this.A, this.q);
             this.z = oo;
             this.setTouchDelegate(oo);
          }else {
             tz.a(this.B, this.A);
          }
       }
       return;
    }
    public void onMeasure(int p0,int p1){
       SearchView tU0;
       if (this.L()) {
          super.onMeasure(p0, p1);
          return;
       }else {
          int mode = View$MeasureSpec.getMode(p0);
          p0 = View$MeasureSpec.getSize(p0);
          if (mode != Integer.MIN_VALUE) {
             if (mode) {
                if (mode == 0x40000000) {
                   tU0 = this.U0;
                   if (tU0 > null) {
                      p0 = Math.min(tU0, p0);
                   }
                }
             }else {
                SearchView tU01 = this.U0;
                if (tU01 <= null) {
                   tU01 = this.getPreferredWidth();
                }
             }
          }else {
             tU0 = this.U0;
             p0 = (tU0 > null)? Math.min(tU0, p0): Math.min(this.getPreferredWidth(), p0);
          }
          mode = View$MeasureSpec.getMode(p1);
          p1 = View$MeasureSpec.getSize(p1);
          if (mode != Integer.MIN_VALUE) {
             if (!mode) {
                p1 = this.getPreferredHeight();
             }
          }else {
             p1 = Math.min(this.getPreferredHeight(), p1);
          }
          super.onMeasure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec(p1, 0x40000000));
          return;
       }
    }
    public void onRestoreInstanceState(Parcelable p0){
       if (!p0 instanceof SearchView$SavedState) {
          super.onRestoreInstanceState(p0);
          return;
       }else {
          super.onRestoreInstanceState(p0.a());
          this.k0(p0.d);
          this.requestLayout();
          return;
       }
    }
    public Parcelable onSaveInstanceState(){
       SearchView$SavedState savedState = new SearchView$SavedState(super.onSaveInstanceState());
       savedState.d = this.L();
       return savedState;
    }
    public void onWindowFocusChanged(boolean p0){
       super.onWindowFocusChanged(p0);
       this.b0();
    }
    public boolean requestFocus(int p0,Rect p1){
       if (this.W != null) {
          return false;
       }
       if (!this.isFocusable()) {
          return false;
       }
       if (this.L()) {
          return super.requestFocus(p0, p1);
       }
       boolean b = this.q.requestFocus(p0, p1);
       if (b) {
          this.k0(false);
       }
       return b;
    }
    public void setAppSearchData(Bundle p0){
       this.b1 = p0;
    }
    public void setIconified(boolean p0){
       if (p0) {
          this.R();
       }else {
          this.V();
       }
       return;
    }
    public void setIconifiedByDefault(boolean p0){
       if (this.Q == p0) {
          return;
       }
       this.Q = p0;
       this.k0(p0);
       this.g0();
       return;
    }
    public void setImeOptions(int p0){
       this.q.setImeOptions(p0);
    }
    public void setInputType(int p0){
       this.q.setInputType(p0);
    }
    public void setMaxWidth(int p0){
       this.U0 = p0;
       this.requestLayout();
    }
    public void setOnCloseListener(SearchView$k p0){
       this.M = p0;
    }
    public void setOnQueryTextFocusChangeListener(View$OnFocusChangeListener p0){
       this.N = p0;
    }
    public void setOnQueryTextListener(SearchView$l p0){
       this.L = p0;
    }
    public void setOnSearchClickListener(View$OnClickListener p0){
       this.P = p0;
    }
    public void setOnSuggestionListener(SearchView$m p0){
       this.O = p0;
    }
    public final void setQuery(CharSequence p0){
       this.q.setText(p0);
       SearchView tq = this.q;
       int i = (TextUtils.isEmpty(p0))? 0: p0.length();
       tq.setSelection(i);
       return;
    }
    public void setQueryHint(CharSequence p0){
       this.U = p0;
       this.g0();
    }
    public void setQueryRefinementEnabled(boolean p0){
       this.V = p0;
       SearchView tS = this.S;
       if (tS instanceof g) {
          int i = (p0)? 2: 1;
          tS.w(i);
       }
       return;
    }
    public void setSearchableInfo(SearchableInfo p0){
       this.a1 = p0;
       if (p0 != null) {
          this.h0();
          this.g0();
       }
       boolean b = this.K();
       this.V0 = b;
       if (b) {
          this.q.setPrivateImeOptions("nm");
       }
       this.k0(this.L());
       return;
    }
    public void setSubmitButtonEnabled(boolean p0){
       this.T = p0;
       this.k0(this.L());
    }
    public void setSuggestionsAdapter(a p0){
       this.S = p0;
       this.q.setAdapter(p0);
    }
}
