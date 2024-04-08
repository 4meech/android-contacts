package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public abstract class ListDiffInterface<T> {
    public abstract boolean theSameAs(@NonNull T t);

    public abstract boolean theSameAs(@NonNull ContactUi t);

}
