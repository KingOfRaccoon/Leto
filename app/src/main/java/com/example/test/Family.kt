package com.example.test

enum class Family(var genus: Array<Genus>){
    WIDENOSED(arrayOf(Genus.MARMOSETS, Genus.HOWLERS)),
    NARROWNOSED(arrayOf(Genus.MONKEYS, Genus.MACAQUES)),
    ANTHROPOID(arrayOf(Genus.GORILLAS, Genus.ORANGUTANS, Genus.CHIMPANZEE))
}