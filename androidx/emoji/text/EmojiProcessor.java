package androidx.emoji.text.EmojiProcessor;
import androidx.emoji.text.MetadataRepo;
import androidx.emoji.text.EmojiCompat$SpanFactory;
import java.lang.Object;
import androidx.emoji.text.EmojiProcessor$GlyphChecker;
import android.text.Editable;
import android.view.KeyEvent;
import java.lang.CharSequence;
import android.text.Selection;
import androidx.emoji.text.EmojiSpan;
import java.lang.Class;
import android.view.inputmethod.InputConnection;
import java.lang.Math;
import androidx.emoji.text.EmojiProcessor$CodepointIndexFinder;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import androidx.emoji.text.EmojiMetadata;
import androidx.emoji.text.EmojiProcessor$ProcessorSm;
import androidx.emoji.text.MetadataRepo$Node;
import java.lang.Character;
import android.os.Build$VERSION;
import androidx.emoji.widget.a;
import android.text.Spanned;
import android.text.SpannableString;
import z1.h;

public final class EmojiProcessor	// class@000755
{
    public final int[] mEmojiAsDefaultStyleExceptions;
    public EmojiProcessor$GlyphChecker mGlyphChecker;
    public final MetadataRepo mMetadataRepo;
    public final EmojiCompat$SpanFactory mSpanFactory;
    public final boolean mUseEmojiAsDefaultStyle;

    public void EmojiProcessor(MetadataRepo p0,EmojiCompat$SpanFactory p1,boolean p2,int[] p3){
       super();
       this.mGlyphChecker = new EmojiProcessor$GlyphChecker();
       this.mSpanFactory = p1;
       this.mMetadataRepo = p0;
       this.mUseEmojiAsDefaultStyle = p2;
       this.mEmojiAsDefaultStyleExceptions = p3;
    }
    public static boolean delete(Editable p0,KeyEvent p1,boolean p2){
       if (EmojiProcessor.hasModifiers(p1)) {
          return false;
       }
       int selectionSta = Selection.getSelectionStart(p0);
       int selectionEnd = Selection.getSelectionEnd(p0);
       if (EmojiProcessor.hasInvalidSelection(selectionSta, selectionEnd)) {
          return false;
       }
       EmojiSpan[] spans = p0.getSpans(selectionSta, selectionEnd, EmojiSpan.class);
       if (spans != null && spans.length > 0) {
          int len = spans.length;
          int i = 0;
          while (i < len) {
             object oobject = spans[i];
             int spanStart = p0.getSpanStart(oobject);
             int spanEnd = p0.getSpanEnd(oobject);
             if (!p2 || (spanStart != selectionSta && (p2 || (spanEnd == selectionSta || (selectionSta > spanStart && selectionSta < spanEnd))))) {
                p0.delete(spanStart, spanEnd);
                return true;
             }
             i = i + 1;
          }
       }
       return false;
    }
    public static boolean handleDeleteSurroundingText(InputConnection p0,Editable p1,int p2,int p3,boolean p4){
       if (p1 != null && (p0 == null || (p2 >= 0 && p3 >= 0))) {
          int selectionSta = Selection.getSelectionStart(p1);
          int selectionEnd = Selection.getSelectionEnd(p1);
          if (EmojiProcessor.hasInvalidSelection(selectionSta, selectionEnd)) {
             return false;
          }else if(p4){
             p2 = EmojiProcessor$CodepointIndexFinder.findIndexBackward(p1, selectionSta, Math.max(p2, false));
             p3 = EmojiProcessor$CodepointIndexFinder.findIndexForward(p1, selectionEnd, Math.max(p3, false));
             EmojiSpan uEmojiSpan = -1;
             if (p2 == uEmojiSpan || p3 == uEmojiSpan) {
                return false;
             }
          }else {
             p2 = Math.max((selectionSta - p2), false);
             p3 = Math.min((selectionEnd + p3), p1.length());
          }
          EmojiSpan[] spans = p1.getSpans(p2, p3, EmojiSpan.class);
          if (spans != null && spans.length > 0) {
             selectionSta = spans.length;
             for (selectionEnd = 0; selectionEnd < selectionSta; selectionEnd = selectionEnd + 1) {
                object oobject = spans[selectionEnd];
                int spanStart = p1.getSpanStart(oobject);
                p2 = Math.min(spanStart, p2);
                p3 = Math.max(p1.getSpanEnd(oobject), p3);
             }
             p0.beginBatchEdit();
             p1.delete(Math.max(p2, false), Math.min(p3, p1.length()));
             p0.endBatchEdit();
             return true;
          }
       }
    label_007e :
       return false;
    }
    public static boolean handleOnKeyDown(Editable p0,int p1,KeyEvent p2){
       if (p1 != 67) {
          p1 = (p1 != 112)? 0: EmojiProcessor.delete(p0, p2, true);
       }else {
          boolean b = EmojiProcessor.delete(p0, p2, false);
       }
       if (p1) {
          MetaKeyKeyListener.adjustMetaAfterKeypress(p0);
          return true;
       }else {
          return false;
       }
    }
    public static boolean hasInvalidSelection(int p0,int p1){
       boolean b = (p0 != -1 && (p1 == -1 || p0 != p1))? true: false;
       return b;
    }
    public static boolean hasModifiers(KeyEvent p0){
       return (KeyEvent.metaStateHasNoModifiers(p0.getMetaState()) ^ 0x01);
    }
    public final void addEmoji(Spannable p0,EmojiMetadata p1,int p2,int p3){
       p0.setSpan(this.mSpanFactory.createSpan(p1), p2, p3, 33);
    }
    public EmojiMetadata getEmojiMetadata(CharSequence p0){
       EmojiMetadata uEmojiMetada;
       EmojiProcessor$ProcessorSm processorSm = new EmojiProcessor$ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
       int i = p0.length();
       int i1 = 0;
       while (true) {
          uEmojiMetada = null;
          if (i1 < i) {
             int i2 = Character.codePointAt(p0, i1);
             if (processorSm.check(i2) != 2) {
                break ;
             }else {
                i1 = i1 + Character.charCount(i2);
             }
          }else if(processorSm.isInFlushableState()){
             return processorSm.getCurrentMetadata();
          }else {
             return uEmojiMetada;
          }
       }
       return uEmojiMetada;
    }
    public final boolean hasGlyph(CharSequence p0,int p1,int p2,EmojiMetadata p3){
       int sDK_INT = Build$VERSION.SDK_INT;
       boolean b = false;
       if (sDK_INT < 23 && p3.getSdkAdded() > sDK_INT) {
          return b;
       }
       if (!p3.getHasGlyph()) {
          p3.setHasGlyph(this.mGlyphChecker.hasGlyph(p0, p1, p2));
       }
       if (p3.getHasGlyph() == 2) {
          b = true;
       }
       return b;
    }
    public CharSequence process(CharSequence p0,int p1,int p2,int p3,boolean p4){
       int len;
       int i1;
       if (v0 = p0 instanceof a) {
          p0.a();
       }
       SpannableString spannableStr = null;
       if (v0 || p0 instanceof Spannable) {
          spannableStr = p0;
       }else if(p0 instanceof Spanned && p0.nextSpanTransition((p1 - 1), (p2 + 1), EmojiSpan.class) <= p2){
          spannableStr = new SpannableString(p0);
       }
       int i = 0;
       if (spannableStr != null) {
          EmojiSpan[] spans = spannableStr.getSpans(p1, p2, EmojiSpan.class);
          if (spans != null && spans.length > 0) {
             len = spans.length;
             for (i1 = 0; i1 < len; i1 = i1 + 1) {
                object oobject = spans[i1];
                int spanStart = spannableStr.getSpanStart(oobject);
                int spanEnd = spannableStr.getSpanEnd(oobject);
                if (spanStart != p2) {
                   spannableStr.removeSpan(oobject);
                }
                p1 = Math.min(spanStart, p1);
                p2 = Math.max(spanEnd, p2);
             }
          }
       }
       if (p1 == p2 || p1 >= p0.length()) {
          if (v0) {
             p0.d();
          }
          return p0;
       }else if(p3 != Integer.MAX_VALUE && spannableStr != null){
          p3 = p3 - spannableStr.getSpans(i, spannableStr.length(), EmojiSpan.class).length;
       }
       EmojiProcessor$ProcessorSm processorSm = new EmojiProcessor$ProcessorSm(this.mMetadataRepo.getRootNode(), this.mUseEmojiAsDefaultStyle, this.mEmojiAsDefaultStyleExceptions);
       SpannableString spannableStr1 = spannableStr;
       i1 = Character.codePointAt(p0, p1);
       len = 0;
       while (true) {
          int i2 = p1;
          break ;
       }
       while (true) {
          if (p1 < p2 && len < p3) {
             int i3 = processorSm.check(i1);
             if (i3 != 1) {
                if (i3 != 2) {
                   if (i3 != 3) {
                      continue ;
                   }else if(p4 || !this.hasGlyph(p0, i2, p1, processorSm.getFlushMetadata())){
                      if (spannableStr1 == null) {
                         spannableStr1 = new SpannableString(p0);
                      }
                      this.addEmoji(spannableStr1, processorSm.getFlushMetadata(), i2, p1);
                      len = len + 1;
                   }else {
                      continue ;
                   }
                }else {
                   p1 = p1 + Character.charCount(i1);
                   if (p1 < p2) {
                      i1 = Character.codePointAt(p0, p1);
                   }
                }
             }else {
                i2 = i2 + Character.charCount(Character.codePointAt(p0, i2));
                if (i2 < p2) {
                   i1 = Character.codePointAt(p0, i2);
                }
                p1 = i2;
             }
          }else if(processorSm.isInFlushableState() && (len < p3 && (p4 || !this.hasGlyph(p0, i2, p1, processorSm.getCurrentMetadata())))){
             if (spannableStr1 == null) {
                spannableStr1 = new SpannableString(p0);
             }
             this.addEmoji(spannableStr1, processorSm.getCurrentMetadata(), i2, p1);
          }
       label_0102 :
          if (spannableStr1 == null) {
             spannableStr1 = p0;
          }
          if (v0) {
             p0.d();
             break ;
          }
          break ;
       }
       return spannableStr1;
    }
    public void setGlyphChecker(EmojiProcessor$GlyphChecker p0){
       h.g(p0);
       this.mGlyphChecker = p0;
    }
}
