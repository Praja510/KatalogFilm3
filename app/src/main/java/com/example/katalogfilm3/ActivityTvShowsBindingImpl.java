package com.example.katalogfilm3;

import android.view.View;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

class ActivityTvShowsBindingImpl extends ViewDataBinding {
    public ActivityTvShowsBindingImpl(androidx.databinding.DataBindingComponent component, View view) {
        super();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object value) {
        return false;
    }

    @Override
    protected void executeBindings() {

    }

    @Override
    public void invalidateAll() {

    }

    @Override
    public boolean hasPendingBindings() {
        return false;
    }
}
