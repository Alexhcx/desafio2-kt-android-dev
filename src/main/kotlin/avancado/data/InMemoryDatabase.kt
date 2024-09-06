package avancado.data

import avancado.domain.MarineConservation
import avancado.domain.SpeciesExtinction

class InMemoryDatabase {
    val marineConservations = mutableListOf<MarineConservation>()
    val speciesExtinctions = mutableListOf<SpeciesExtinction>()
}