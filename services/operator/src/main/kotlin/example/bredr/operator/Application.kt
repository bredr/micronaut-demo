package example.bredr.operator

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("example.bredr")
		.start()
}

