package com.google.protobuf.ListValue$Builder;
import com.google.protobuf.ListValueOrBuilder;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.ListValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.ListValue$1;
import java.lang.Iterable;
import com.google.protobuf.Value$Builder;
import com.google.protobuf.Value;
import java.util.List;
import java.util.Collections;

public final class ListValue$Builder extends GeneratedMessageLite$Builder implements ListValueOrBuilder	// class@00046a
{

    public void ListValue$Builder(){
       super(ListValue.DEFAULT_INSTANCE);
    }
    public void ListValue$Builder(ListValue$1 p0){
       super();
    }
    public ListValue$Builder addAllValues(Iterable p0){
       this.copyOnWrite();
       this.instance.addAllValues(p0);
       return this;
    }
    public ListValue$Builder addValues(int p0,Value$Builder p1){
       this.copyOnWrite();
       this.instance.addValues(p0, p1.build());
       return this;
    }
    public ListValue$Builder addValues(int p0,Value p1){
       this.copyOnWrite();
       this.instance.addValues(p0, p1);
       return this;
    }
    public ListValue$Builder addValues(Value$Builder p0){
       this.copyOnWrite();
       this.instance.addValues(p0.build());
       return this;
    }
    public ListValue$Builder addValues(Value p0){
       this.copyOnWrite();
       this.instance.addValues(p0);
       return this;
    }
    public ListValue$Builder clearValues(){
       this.copyOnWrite();
       this.instance.clearValues();
       return this;
    }
    public Value getValues(int p0){
       return this.instance.getValues(p0);
    }
    public int getValuesCount(){
       return this.instance.getValuesCount();
    }
    public List getValuesList(){
       return Collections.unmodifiableList(this.instance.getValuesList());
    }
    public ListValue$Builder removeValues(int p0){
       this.copyOnWrite();
       this.instance.removeValues(p0);
       return this;
    }
    public ListValue$Builder setValues(int p0,Value$Builder p1){
       this.copyOnWrite();
       this.instance.setValues(p0, p1.build());
       return this;
    }
    public ListValue$Builder setValues(int p0,Value p1){
       this.copyOnWrite();
       this.instance.setValues(p0, p1);
       return this;
    }
}
