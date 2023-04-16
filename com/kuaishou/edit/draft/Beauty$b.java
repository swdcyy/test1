package com.kuaishou.edit.draft.Beauty$b;
import com.kuaishou.edit.draft.d;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Beauty;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Beauty$a;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Beauty$Item;
import com.kuaishou.edit.draft.Attributes;
import com.kuaishou.edit.draft.FeatureId$b;
import java.lang.String;
import com.google.protobuf.ByteString;
import com.kuaishou.edit.draft.EffectSource;
import com.kuaishou.edit.draft.FeatureId;
import java.util.List;
import java.util.Collections;

public final class Beauty$b extends GeneratedMessageLite$Builder implements d	// class@001736
{

    public void Beauty$b(){
       super(Beauty.DEFAULT_INSTANCE);
    }
    public void Beauty$b(Beauty$a p0){
       super(Beauty.DEFAULT_INSTANCE);
    }
    public Beauty$b a(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllItem(p0);
       return this;
    }
    public Beauty$b b(Beauty$Item p0){
       this.copyOnWrite();
       this.instance.addItem(p0);
       return this;
    }
    public Beauty$b c(Attributes p0){
       this.copyOnWrite();
       this.instance.setAttributes(p0);
       return this;
    }
    public Beauty$b d(FeatureId$b p0){
       this.copyOnWrite();
       this.instance.setFeatureId(p0);
       return this;
    }
    public Attributes getAttributes(){
       return this.instance.getAttributes();
    }
    public String getBrightItem(){
       return this.instance.getBrightItem();
    }
    public ByteString getBrightItemBytes(){
       return this.instance.getBrightItemBytes();
    }
    public EffectSource getEffectSource(){
       return this.instance.getEffectSource();
    }
    public int getEffectSourceValue(){
       return this.instance.getEffectSourceValue();
    }
    public FeatureId getFeatureId(){
       return this.instance.getFeatureId();
    }
    public boolean getIsAiBeauty(){
       return this.instance.getIsAiBeauty();
    }
    public Beauty$Item getItem(int p0){
       return this.instance.getItem(p0);
    }
    public int getItemCount(){
       return this.instance.getItemCount();
    }
    public List getItemList(){
       return Collections.unmodifiableList(this.instance.getItemList());
    }
    public boolean hasAttributes(){
       return this.instance.hasAttributes();
    }
    public boolean hasFeatureId(){
       return this.instance.hasFeatureId();
    }
}
