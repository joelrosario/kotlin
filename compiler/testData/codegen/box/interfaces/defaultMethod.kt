// DONT_TARGET_EXACT_BACKEND: JS JS_IR JS_IR_ES6 WASM NATIVE
// JVM_TARGET: 1.8

// MODULE: lib
// FILE: A.java

public interface A {
    default String getMessage() {
        return "OK";
    }
}

// MODULE: main(lib)
// FILE: 1.kt

interface I : A

class B : A

open class C(a : A) : I, A by a

fun box(): String {
    val a = B()
    return C(a).message
}
