package com.premaseem;

/*
@author: Aseem Jain
@title: Design Patterns with Java 9
@link: https://premaseem.wordpress.com/category/computers/design-patterns/
*/
/**
 * The Command functional interface.
 */
@FunctionalInterface
public interface Command {
    public void execute();
}
