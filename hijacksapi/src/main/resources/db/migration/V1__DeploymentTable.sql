CREATE TABLE deployment (
    id INT PRIMARY KEY,
    country VARCHAR(50),
    detected_as_path BIGINT,
    detected_by_bgpmon_peers INT,
    detected_origin_name VARCHAR(200),
    detected_origin_number BIGINT,
    start_time TIMESTAMP,
    end_time TIMESTAMP,
    event_number INT,
    event_type VARCHAR(50),
    expected_origin_name VARCHAR(200),
    expected_origin_number BIGINT,
    expected_prefix CIDR,
    more_specific_prefix CIDR,
    url VARCHAR(250)
);
