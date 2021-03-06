package com.jun.annotation;

import android.view.View;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@AnnotationType(value = "setOnClickListener", eventClass = View.OnClickListener.class)
public @interface OnClick {
    int[] ids();//传入id
}
