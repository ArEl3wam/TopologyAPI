# Welcome to TopologyAPI!

ToplogyApi is Library built in java using Maven to provide the following functionalities to your Topology


# Supported Functions



## readTopology(path)

once you enter JSON file path as string, this function will update your topologies in memory by parsing valid JSON topologies from disc

## writeTopology(path)

once you enter JSON file path as string, this function will save your topologies from memory to disc in form of valid JSON file
## currentTopologyReader()

this function returns current topologies in memory

## deleteTopology(topologyID)

this function deletes topology from memory once given a valid topologyID

## devicesQuery(topologyID)

this functions returns list of devices in a topology once you enter a valid topologyID as string

## queryDevicesWithNetlistNode(topologyID , netListKey)

this functions returns list of devices connected to a given a topology once you enter a valid topologyID as string and netListKey as string.
