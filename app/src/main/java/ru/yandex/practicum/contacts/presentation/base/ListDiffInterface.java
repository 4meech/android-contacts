package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    public boolean theSameAs(T anotherItem);
    public boolean equals(Object anotherItem);
}